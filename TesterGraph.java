public class TesterGraph {
    public static void main(String[] args) throws InterruptedException{
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;
        GraphView gView = new GraphView(n1, n2, n3);
        Numbers model = new Numbers(n1, n2, n3);
        model.attach(gView);
        NumberView nView = new NumberView(n1, n2, n3, model);
    }
}
