public class MayaNumberConverter {
    public MayaNumberConverter(int value) {
        if(value < 0) {
            System.out.println("Can't convert negative number");
        } else {
            convertValue(value);
        }
    }

    private void convertValue(int num) {
        if(num / 20 != 0) convertValue(num / 20);
        numberToMaya(num % 20);
    }

    private void numberToMaya(int num) {
        String stringBuilder = "|".repeat(Math.max(0, num / 5)) +
                ".".repeat(Math.max(0, num % 5));
        if(num == 0) stringBuilder += "0";
        System.out.println(stringBuilder);
    }
}
