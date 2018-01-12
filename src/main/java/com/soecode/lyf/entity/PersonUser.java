package com.soecode.lyf.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Calendar;

public class PersonUser {
    private int UserID;
    private float Gender;
    private String Birthday;
    private int Stature;
    private int Weight;
    private float Degree;
    private String School;
    private int SchoolID;
    private float NowSalary;
    private String Interest;
    private String Experties;
    private float CardType;
    private String CardID;
    private String title;
    private String CompanyName;
    private float CompanyTrade;
    private int NowAreaID;
    private int HomeAreaID;
    private int CompanyAreaId;


    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public float getGender() {
        return Gender;
    }

    public void setGender(float gender) {
        Gender = gender;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public int getStature() {
        return Stature;
    }

    public void setStature(int stature) {
        Stature = stature;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public float getDegree() {
        return Degree;
    }

    public void setDegree(float degree) {
        Degree = degree;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public int getSchoolID() {
        return SchoolID;
    }

    public void setSchoolID(int schoolID) {
        SchoolID = schoolID;
    }

    public float getNowSalary() {
        return NowSalary;
    }

    public void setNowSalary(float nowSalary) {
        NowSalary = nowSalary;
    }

    public String getInterest() {
        return Interest;
    }

    public void setInterest(String interest) {
        Interest = interest;
    }

    public String getExperties() {
        return Experties;
    }

    public void setExperties(String experties) {
        Experties = experties;
    }

    public float getCardType() {
        return CardType;
    }

    public void setCardType(float cardType) {
        CardType = cardType;
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String cardID) {
        CardID = cardID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public float getCompanyTrade() {
        return CompanyTrade;
    }

    public void setCompanyTrade(float companyTrade) {
        CompanyTrade = companyTrade;
    }

    public int getNowAreaID() {
        return NowAreaID;
    }

    public void setNowAreaID(int nowAreaID) {
        NowAreaID = nowAreaID;
    }

    public int getHomeAreaID() {
        return HomeAreaID;
    }

    public void setHomeAreaID(int homeAreaID) {
        HomeAreaID = homeAreaID;
    }

    public int getCompanyAreaId() {
        return CompanyAreaId;
    }

    public void setCompanyAreaId(int companyAreaId) {
        CompanyAreaId = companyAreaId;
    }

    public PersonUser(){

    }

    public PersonUser(int userID, float gender, String birthday, int stature, int weight, float degree, String school, int schoolID, float nowSalary, String interest, String experties, float cardType, String cardID, String title, String companyName, float companyTrade, int nowAreaID, int homeAreaID, int companyAreaId) {
        UserID = userID;
        Gender = gender;
        Birthday = birthday;
        Stature = stature;
        Weight = weight;
        Degree = degree;
        School = school;
        SchoolID = schoolID;
        NowSalary = nowSalary;
        Interest = interest;
        Experties = experties;
        CardType = cardType;
        CardID = cardID;
        this.title = title;
        CompanyName = companyName;
        CompanyTrade = companyTrade;
        NowAreaID = nowAreaID;
        HomeAreaID = homeAreaID;
        CompanyAreaId = companyAreaId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("UserID", UserID)
                .append("Gender", Gender)
                .append("Birthday", Birthday)
                .append("Stature", Stature)
                .append("Weight", Weight)
                .append("Degree", Degree)
                .append("School", School)
                .append("SchoolID", SchoolID)
                .append("NowSalary", NowSalary)
                .append("Interest", Interest)
                .append("Experties", Experties)
                .append("CardType", CardType)
                .append("CardID", CardID)
                .append("title", title)
                .append("CompanyName", CompanyName)
                .append("CompanyTrade", CompanyTrade)
                .append("NowAreaID", NowAreaID)
                .append("HomeAreaID", HomeAreaID)
                .append("CompanyAreaId", CompanyAreaId)
                .toString();
    }
}
