package com.test.java.problemsolve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

public class Problem126 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\a\\Desktop\\coding\\기타\\문제109~126와 데이터\\문제109~126와 데이터\\파일입출력\\파일 입출력 문제\\출결.dat";
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m");
//        
//        LocalTime goWorkTime = LocalTime.of(9, 0);
//        LocalTime leaveWorkTime = LocalTime.of(18, 0);
//        
//        LinkedHashMap<String, Integer[]> report = new LinkedHashMap<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            String line = "";
//            while ((line = br.readLine()) != null) {
//                String[] data = line.split(",");
//                if (data.length < 4) continue; // 데이터 부족 시 건너뛰기
//
//                String name = data[1];
//                // 지정한 포맷터를 사용하여 파싱
//                LocalTime inTime = LocalTime.parse(data[2], formatter);
//                LocalTime outTime = LocalTime.parse(data[3], formatter);
//
//                if (!report.containsKey(name)) {
//                    report.put(name, new Integer[] {0, 0});
//                }
//
//                Integer[] counts = report.get(name);
//
//                if (inTime.isAfter(goWorkTime)) counts[0]++;  // 지각
//                if (outTime.isBefore(leaveWorkTime)) counts[1]++; // 조퇴
//            }
//
//            System.out.println("[이름]\t[지각]\t[조퇴]");
//            for (String name : report.keySet()) {
//                Integer[] counts = report.get(name);
//                System.out.printf("%s\t%d회\t%d회\n", name, counts[0], counts[1]);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		int goWorkLimit = 9 * 60;    // 540분
        int leaveWorkLimit = 18 * 60; // 1080분
        
        LinkedHashMap<String, int[]> report = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 4) continue;

                String name = data[1];
                
                // 문자열에서 시간과 분을 직접 추출하여 정수로 변환
                int inTotalMinutes = parseToMinutes(data[2]);  // 출근시간 -> 분
                int outTotalMinutes = parseToMinutes(data[3]); // 퇴근시간 -> 분

                if (!report.containsKey(name)) {
                    report.put(name, new int[] {0, 0}); // [0]:지각, [1]:조퇴
                }

                int[] counts = report.get(name);

                // 분 단위로 대소 비교
                if (inTotalMinutes > goWorkLimit) counts[0]++;    // 지각
                if (outTotalMinutes < leaveWorkLimit) counts[1]++; // 조퇴
            }

            // 결과 출력
            System.out.println("[이름]\t[지각]\t[조퇴]");
            for (String name : report.keySet()) {
                int[] counts = report.get(name);
                System.out.printf("%s\t%d회\t%d회\n", name, counts[0], counts[1]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * "8:16" 또는 "16:13" 형태의 문자열을 받아서 총 분(minute)으로 반환하는 메서드
     */
    private static int parseToMinutes(String timeStr) {
        // 콜론(:)을 기준으로 시와 분 분리
        String[] parts = timeStr.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        
        return (hour * 60) + minute;
    }
	
	
}
