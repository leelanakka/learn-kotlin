public class Some {
    public Some() {

    }

    public static void main(String[] args) {
        System.out.println(fuck());
    }

    private static String fuck() {
        String board = "|";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                board += "-";
            }
            board += "|\n|\n|";
        }
        return board;
    }
}
