package timbuchalka.demy.appartment;

public class TheWindow {
    private String material;
    private boolean hasWindow;

    public TheWindow(boolean hasWindow, String material) {
        if (!hasWindow){
            material="no Window";
        }
        this.hasWindow = hasWindow;
        this.material = material;
    }

    public TheWindow (){
        this(false, "No window");
    }
}
