import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String fileName = "text4.txt";
    Child child  = new Child();
    child.setProductId(4793);
    child.setProductName("ProdName");
    child.setBrand("Brand");

    try{
        SerilizationLib.doSerizalize(child,fileName);
        System.out.println("Serializing");
        Child child2 = (Child) SerilizationLib.readFile(fileName);
        System.out.println(child);


    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }

}
