package pairmatching.view;

public class ConsoleInputView {

    private static  final String NEW_LINE = "\n";
    private static  final String INPUT_FUNCTION_REQUEST_MESSAGE = "기능을 선택하세요.";
    private static  final String INPUT_FUNCTION_INFO_MESSAGE = "\n1. 페어 매칭\n2. 페어 조회\n3. 페어 초기화\nQ. 종료";

    public String inputFunction() {
        System.out.println(INPUT_FUNCTION_REQUEST_MESSAGE);
        System.out.println(INPUT_FUNCTION_INFO_MESSAGE);

        String input = camp.nextstep.edu.missionutils.Console.readLine();

        System.out.println(NEW_LINE);
        return input;
    }
}