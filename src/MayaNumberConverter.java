public class MayaNumberConverter {
    public MayaNumberConverter(int value) {
        convertValue(value);
    }

    private void convertValue(int num) {
        if(num / 20 != 0) {
            convertValue(num / 20);
        }
        numberToMaya(num % 20);
    }

    private void numberToMaya(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num / 5; i++) {
            stringBuilder.append("|");
        }
        for (int i = 0; i < num % 5; i++) {
            stringBuilder.append(".");
        }
        System.out.println(stringBuilder.toString());
    }
}
