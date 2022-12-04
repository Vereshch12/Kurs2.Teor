public class Task1 {
    public static void main(String[] args) {
        String str = "";
        if (str.isEmpty() || str.isBlank() || str == null)
            throw new IllegalArgumentException("Строка пустая!");
        String str1;
        String str2 = str.substring(str.length()/2);
        if (str.length() % 2 == 0){
            str1 = str.substring(0, str.length()/2);
        }else{
            str1 = str.substring(0, str.length()/2 + 1);
        }
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }
}
