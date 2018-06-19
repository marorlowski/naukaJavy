package kurs00001;

public class Outside {
    private class Inside {
        private int i = 100;
    }

    Inside ins = new Inside();

    public void change() {
        ins.i = 90;


        Inter inter = new Inter() {
            @Override
            public void inter() {

            }
        };
    }


    public void dodo() {
        int i = 35;
        double d = i;
        double dd =56.8;
        int a= (int)dd;
       System.out.println(a);
    }


}




