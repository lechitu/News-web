package model;

public class NewsModel extends AbstractModel {

    private String title;
    private String thumbnail;
    private String shortDescription;
    private String content;
    private Long categoryId;

    public Long getCategoryId() {
        return categoryId;
    }

    public String getContent() {
        return content;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
