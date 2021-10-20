package ru.netology.domain;

public class Post {
    private int id;
    private String text;
    private int postId;
    private int ownerId;
    private int ownerSpaceUserId;
    private int wroteUserId;
    private int date;

    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canPin;
    private boolean IsPinned;

    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private Repostinfo repostinfo;
    private ViewsInfo viewsInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getOwnerSpaceUserId() {
        return ownerSpaceUserId;
    }

    public void setOwnerSpaceUserId(int ownerSpaceUserId) {
        this.ownerSpaceUserId = ownerSpaceUserId;
    }

    public int getWroteUserId() {
        return wroteUserId;
    }

    public void setWroteUserId(int wroteUserId) {
        this.wroteUserId = wroteUserId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Repostinfo getRepostinfo() {
        return repostinfo;
    }

    public void setRepostinfo(Repostinfo repostinfo) {
        this.repostinfo = repostinfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }
}
