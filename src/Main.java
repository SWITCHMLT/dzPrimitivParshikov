public void Main() {

}
    public void main() {
        // 1.Неявне перетворення byte на short / Out 5;
        byte valueByte=5;
        short valueShort;
        valueShort= valueByte;
        System.out.println (valueShort);
        // 2..Явне перетворення short to byte / Out 6
        valueByte = 1;
        byte newValueByte = (byte) (valueByte + valueShort);
        System.out.println (newValueByte);
        // 3. Неявне перетворення short на int / Out 7
        int valueInt=2;
        valueInt = valueInt + valueShort;
        System.out.println (valueInt);
        // 4.  Явное перетворення int to short / Out 7
        valueShort = (short)(valueInt);
        System.out.println (valueShort);
        // 5. Неявне перетворення int на long / Out 8
        long valueLong= 1;
        valueLong = valueInt + valueLong;
        System.out.println (valueLong);
        // 6. Явне перетворення long to int / Out 8
        int newValueInt3 = (int)(valueLong);
        System.out.println (newValueInt3);
        // 7. Неявне перетворення Long на float / Out 10.0
        float valueFloat = 2;
        float sumLF = (valueLong + valueFloat);
        valueFloat = sumLF;
        System.out.println (valueFloat);
        // 8. Явне перетворення float to long / Out 10
        long newValueLong = (long)(valueFloat);
        System.out.println (newValueLong);
        // 9. Невне перетворення Float to Double / Out 10.5
        double valueDouble = 2.5;
        valueFloat = 8;
        valueDouble = valueDouble+valueFloat;
        System.out.println (valueDouble);
        // 10. Явне перетворення Double to Float / Out 10.5
        float newValueFloat = (float) (valueDouble);
        System.out.println (newValueFloat);
        // 11. Неявне перетворення char на int / Out 65
        char charValue = 'A';
        int newValueInt = charValue;
        System.out.println (newValueInt);

        // 12. Явне перетворення int to char / Out A
        char valueCharNew = (char)newValueInt;
        System.out.println (valueCharNew);




    }