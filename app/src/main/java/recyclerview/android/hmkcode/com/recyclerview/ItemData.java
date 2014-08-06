package recyclerview.android.hmkcode.com.recyclerview;

/**
 * Created by lp43 on 2014/8/4.
 */
public class ItemData {
    private String title;
    private String imageUrl;

    public ItemData(String title,String imageUrl){

        this.title = title;
        this.imageUrl = imageUrl;

    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
