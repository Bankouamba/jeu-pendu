import java.util.Random;
public class BanqueMots {
    String[] mts= {"Charles","Efraim","Theodora","Amdia","Emilie"};

    public String tirerMotAuHasard() {
        Random random = new Random();
        int num= random.nextInt(mts.length);
        String monchoix= mts[num];
        return monchoix;
    }
}
