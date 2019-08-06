package com.company.dao.pojo;

public class Score {
    private int scid;
    private double score;
    private Course course;

    @Override
    public String toString() {
        return "Score{" +
                "scid=" + scid +
                ", score=" + score +
                ", course=" + course +
                '}';
    }

    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Score(int scid, double score, Course course) {
        this.scid = scid;
        this.score = score;
        this.course = course;
    }

    public Score() {
    }
}
