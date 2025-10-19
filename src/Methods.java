import java.util.Scanner;
class Methods{
    private static final String[] colors = {"\u001B[31m","\u001B[32m","\u001B[33m","\u001B[34m","\u001B[35m","\u001B[36m","\u001B[37m"};
    private static final String[] name = {"Э","л","л","о","ч","к","а"," ","Л","ю","д","о","е","д","к","а"};
    private static final String[] phrases = {"Хамите!", "Хо-хо!", "Знаменито.", "Мрачный.","Мрак.", "Жуть.","Парниша!", "Блеск!", "Не учите меня жить!", "Как ребёнка.", "Кр-р-расота!", "Толстый и красивый.", "Поедем на извозчике!", "Поедем на таксо!", "У вас вся спина белая.", "подумаешь!", "уля", "Ого!", "Приветик","ЖЕЛЕЗНО!"};
    private static final String ellaReplica = "Эллочка: \u001B[31m%s\u001B[0m\n";

    public static void greeting(){
        for(String i: name){
            int numColor = (int) (Math.random() * 6);
            System.out.print(colors[numColor]+i+"\u001B[0m");
        }
        System.out.printf("\n\n"+ellaReplica, phrases[18]);
    }

    public static void body(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("\u001B[36m"); // Окрашивает строчки пользователя в голубой цвет.
            String you = scan.nextLine();
            System.out.print("\u001B[0m");  // Возвращает белый цвет после ввода текста.
            int random = (int) (Math.random() * 20);
            System.out.printf(ellaReplica, phrases[random]);
        }
    }
}