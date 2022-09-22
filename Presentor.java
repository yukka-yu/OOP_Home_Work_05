package home5;

public class Presentor {
    View view;
    Model model;

    public Presentor(View v, Model m){
        this.view = v;
        this.model = m;
    }

    public void Butt(){
        double choice = view.getValue("What numbers will we work with?\n1 - complex numbers\n2 - rational numbers\nChoice: ",2);
        if((int) choice == 1){
            //double a = view.getValue("What numbers will we work with?\n1 - complex numbers\n2 - rational numbers\nChoice: ",2);

        }
        else{

        }
    }



}
