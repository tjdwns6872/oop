package training.factoryTemplate_1;

public abstract class DocumentTemplate {

    public abstract void header();
    public abstract void body();
    public abstract void footer();    

    public final void execude(){
        header();
        body();
        footer();
    }
}
