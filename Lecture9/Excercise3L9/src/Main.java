import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main (String[] args) {

        String fileName = "test3.txt";
        SerilizationDef serilizationDef = new SerilizationDef();
        serilizationDef.setProductName("Product");
        serilizationDef.setFeatureCount(56);
        serilizationDef.setGetProductFeature("Feature");
        System.out.println(serilizationDef);
        System.out.println("Serializing");
        try {

            SerilizationLib.doSerizalize(serilizationDef, fileName);
            System.out.println("DeSerializing");
            SerilizationDef read = (SerilizationDef) SerilizationLib.readFile(fileName);
            System.out.println(read);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
