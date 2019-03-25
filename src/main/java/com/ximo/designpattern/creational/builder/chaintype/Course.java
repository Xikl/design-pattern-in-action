package com.ximo.designpattern.creational.builder.chaintype;

/**
 * 链式调用
 *
 * @author xikl
 * @date 2019/3/25
 */
public class Course {


    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;

    //question & answer
    private String courseQA;

    public Course(Builder builder) {
        String courseName = builder.courseName;
        String coursePPT = builder.coursePPT;
        String courseVideo = builder.courseVideo;
        String courseArticle = builder.courseArticle;
        String courseQA = builder.courseQA;
    }

    public static class Builder {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public Builder courseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Builder coursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public Builder courseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public Builder courseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public Builder courseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
