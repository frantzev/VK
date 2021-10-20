package ru.netology.domain;

public class RepostInfo {
    private int count;
    private boolean canRepostUser;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanRepostUser() {
        return canRepostUser;
    }

    public void setCanRepostUser(boolean canRepostUser) {
        this.canRepostUser = canRepostUser;
    }
}
