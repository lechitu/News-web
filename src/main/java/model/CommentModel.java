package model;

public class CommentModel extends AbstractModel {

    private String content;
    private Long userId;
    private Long new_id;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Long getNew_id() {
        return new_id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setNew_id(Long new_id) {
        this.new_id = new_id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
