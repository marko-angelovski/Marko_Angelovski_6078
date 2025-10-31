public class Main {
    public static void main(String[] args) {

        Cookie cooke = new Cookie(100,"Round");
        ChocolateCookie ck = new ChocolateCookie(100.5,"Square",20);
        ChocolateCookieWithExtras cke = new ChocolateCookieWithExtras(20.5,"Rectangle",30,"hazelnut");
        cooke.print();
        ck.print();
        cke.print();

            }
}