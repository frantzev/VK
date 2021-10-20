package ru.netology.domain;

public class ViewsInfo {
    private int count;
    private boolean canViewsPost;
    private boolean canLocationId;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanViewsPost() {
        return canViewsPost;
    }

    public void setCanViewsPost(boolean canViewsPost) {
        this.canViewsPost = canViewsPost;
    }
    public boolean isCanLocationId() {
        return canLocationId;
    }

    public void setCanLocationId(boolean canLocationId) {
        this.canLocationId = canLocationId;
    }
}