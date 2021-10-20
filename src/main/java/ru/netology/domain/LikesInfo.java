package ru.netology.domain;

public class LikesInfo {
    public class LikesInfo {
        private int count;
        private boolean canLike;
        private boolean canPublish;

        public boolean isCanPublish() {
            return canPublish;
        }

        public void setCanPublish(boolean canPublish) {
            this.canPublish = canPublish;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public boolean isCanLike() {
            return canLike;
        }

        public void setCanLike(boolean canLike) {
            this.canLike = canLike;
        }
}
