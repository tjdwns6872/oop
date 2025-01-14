package training.factoryTemplate_1;

public class HtmlTemplate extends DocumentTemplate{

    @Override
    public void header() {
        System.out.println("<header>HTML Header</header>");
    }

    @Override
    public void body() {
        System.out.println("<body>HTML Body</body>");
    }

    @Override
    public void footer() {
        System.out.println("<footer>HTML Footer</footer>");
    }
    
}
