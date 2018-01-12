package com.soecode.lyf.entity;

public class User {
    private int UserId;
    private String UserName;
    private String LoweredUserName;
    private String Password;
    private String PasswordSalt;
    private int PasswordFormat;
    private String PasswordQuestion;
    private String PasswordAnswer;
    private String PrivateEmail;
    private String LoseredPrivateEmail;
    private String MembershipID;
    private String CommonName;
    private String NickName;
    private int ForceLogin;
    private String UserAccountStatus;
    private String LastActivity;
    private String LastAction;
    private String IPCreated;
    private String IPLastActivity;
    private int DatabaseQuoto;
    private int DatabaseQuotaUsed;
    private int ModerationLevel;
    private int EnableAvatar;
    private int IsAvatarApproved;
    private int EnabledDisplayInMemberList;
    private int EnableOnlineStatus;
    private int EnableEmail;
    private int EnableHtmlEmail;
    private int UserRankType;
    private int UserType;
    private String PublicEmail;
    private String Mobile;
    private String WeChatIM;
    private String QQIM;
    private String blogAddress;
    private String facebookIM;
    private String PersonalHomePage;
    private int InviteUserId;
    private int InviteCludId;
    private int MemberLevel;
    private String Theme;
    private String ThemeApprarence;
    private float BasicPoints;
    private float TradePoints;
    private float Rank;
    private float ProfileIntegrity;
    private int FriendCount;
    private int InviteFriendCount;
    private int LoginTimes;
    private int HitTimes;
    private int WeekHitTimes;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getLoweredUserName() {
        return LoweredUserName;
    }

    public void setLoweredUserName(String loweredUserName) {
        LoweredUserName = loweredUserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPasswordSalt() {
        return PasswordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        PasswordSalt = passwordSalt;
    }

    public int getPasswordFormat() {
        return PasswordFormat;
    }

    public void setPasswordFormat(int passwordFormat) {
        PasswordFormat = passwordFormat;
    }

    public String getPasswordQuestion() {
        return PasswordQuestion;
    }

    public void setPasswordQuestion(String passwordQuestion) {
        PasswordQuestion = passwordQuestion;
    }

    public String getPasswordAnswer() {
        return PasswordAnswer;
    }

    public void setPasswordAnswer(String passwordAnswer) {
        PasswordAnswer = passwordAnswer;
    }

    public String getPrivateEmail() {
        return PrivateEmail;
    }

    public void setPrivateEmail(String privateEmail) {
        PrivateEmail = privateEmail;
    }

    public String getLoseredPrivateEmail() {
        return LoseredPrivateEmail;
    }

    public void setLoseredPrivateEmail(String loseredPrivateEmail) {
        LoseredPrivateEmail = loseredPrivateEmail;
    }

    public String getMembershipID() {
        return MembershipID;
    }

    public void setMembershipID(String membershipID) {
        MembershipID = membershipID;
    }

    public String getCommonName() {
        return CommonName;
    }

    public void setCommonName(String commonName) {
        CommonName = commonName;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public int getForceLogin() {
        return ForceLogin;
    }

    public void setForceLogin(int forceLogin) {
        ForceLogin = forceLogin;
    }

    public String getUserAccountStatus() {
        return UserAccountStatus;
    }

    public void setUserAccountStatus(String userAccountStatus) {
        UserAccountStatus = userAccountStatus;
    }

    public String getLastActivity() {
        return LastActivity;
    }

    public void setLastActivity(String lastActivity) {
        LastActivity = lastActivity;
    }

    public String getLastAction() {
        return LastAction;
    }

    public void setLastAction(String lastAction) {
        LastAction = lastAction;
    }

    public String getIPCreated() {
        return IPCreated;
    }

    public void setIPCreated(String IPCreated) {
        this.IPCreated = IPCreated;
    }

    public String getIPLastActivity() {
        return IPLastActivity;
    }

    public void setIPLastActivity(String IPLastActivity) {
        this.IPLastActivity = IPLastActivity;
    }

    public int getDatabaseQuoto() {
        return DatabaseQuoto;
    }

    public void setDatabaseQuoto(int databaseQuoto) {
        DatabaseQuoto = databaseQuoto;
    }

    public int getDatabaseQuotaUsed() {
        return DatabaseQuotaUsed;
    }

    public void setDatabaseQuotaUsed(int databaseQuotaUsed) {
        DatabaseQuotaUsed = databaseQuotaUsed;
    }

    public int getModerationLevel() {
        return ModerationLevel;
    }

    public void setModerationLevel(int moderationLevel) {
        ModerationLevel = moderationLevel;
    }

    public int getEnableAvatar() {
        return EnableAvatar;
    }

    public void setEnableAvatar(int enableAvatar) {
        EnableAvatar = enableAvatar;
    }

    public int getIsAvatarApproved() {
        return IsAvatarApproved;
    }

    public void setIsAvatarApproved(int isAvatarApproved) {
        IsAvatarApproved = isAvatarApproved;
    }

    public int getEnabledDisplayInMemberList() {
        return EnabledDisplayInMemberList;
    }

    public void setEnabledDisplayInMemberList(int enabledDisplayInMemberList) {
        EnabledDisplayInMemberList = enabledDisplayInMemberList;
    }

    public int getEnableOnlineStatus() {
        return EnableOnlineStatus;
    }

    public void setEnableOnlineStatus(int enableOnlineStatus) {
        EnableOnlineStatus = enableOnlineStatus;
    }

    public int getEnableEmail() {
        return EnableEmail;
    }

    public void setEnableEmail(int enableEmail) {
        EnableEmail = enableEmail;
    }

    public int getEnableHtmlEmail() {
        return EnableHtmlEmail;
    }

    public void setEnableHtmlEmail(int enableHtmlEmail) {
        EnableHtmlEmail = enableHtmlEmail;
    }

    public int getUserRankType() {
        return UserRankType;
    }

    public void setUserRankType(int userRankType) {
        UserRankType = userRankType;
    }

    public int getUserType() {
        return UserType;
    }

    public void setUserType(int userType) {
        UserType = userType;
    }

    public String getPublicEmail() {
        return PublicEmail;
    }

    public void setPublicEmail(String publicEmail) {
        PublicEmail = publicEmail;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getWeChatIM() {
        return WeChatIM;
    }

    public void setWeChatIM(String weChatIM) {
        WeChatIM = weChatIM;
    }

    public String getQQIM() {
        return QQIM;
    }

    public void setQQIM(String QQIM) {
        this.QQIM = QQIM;
    }

    public String getBlogAddress() {
        return blogAddress;
    }

    public void setBlogAddress(String blogAddress) {
        this.blogAddress = blogAddress;
    }

    public String getFacebookIM() {
        return facebookIM;
    }

    public void setFacebookIM(String facebookIM) {
        this.facebookIM = facebookIM;
    }

    public String getPersonalHomePage() {
        return PersonalHomePage;
    }

    public void setPersonalHomePage(String personalHomePage) {
        PersonalHomePage = personalHomePage;
    }

    public int getInviteUserId() {
        return InviteUserId;
    }

    public void setInviteUserId(int inviteUserId) {
        InviteUserId = inviteUserId;
    }

    public int getInviteCludId() {
        return InviteCludId;
    }

    public void setInviteCludId(int inviteCludId) {
        InviteCludId = inviteCludId;
    }

    public int getMemberLevel() {
        return MemberLevel;
    }

    public void setMemberLevel(int memberLevel) {
        MemberLevel = memberLevel;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public String getThemeApprarence() {
        return ThemeApprarence;
    }

    public void setThemeApprarence(String themeApprarence) {
        ThemeApprarence = themeApprarence;
    }

    public float getBasicPoints() {
        return BasicPoints;
    }

    public void setBasicPoints(float basicPoints) {
        BasicPoints = basicPoints;
    }

    public float getTradePoints() {
        return TradePoints;
    }

    public void setTradePoints(float tradePoints) {
        TradePoints = tradePoints;
    }

    public float getRank() {
        return Rank;
    }

    public void setRank(float rank) {
        Rank = rank;
    }

    public float getProfileIntegrity() {
        return ProfileIntegrity;
    }

    public void setProfileIntegrity(float profileIntegrity) {
        ProfileIntegrity = profileIntegrity;
    }

    public int getFriendCount() {
        return FriendCount;
    }

    public void setFriendCount(int friendCount) {
        FriendCount = friendCount;
    }

    public int getInviteFriendCount() {
        return InviteFriendCount;
    }

    public void setInviteFriendCount(int inviteFriendCount) {
        InviteFriendCount = inviteFriendCount;
    }

    public int getLoginTimes() {
        return LoginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        LoginTimes = loginTimes;
    }

    public int getHitTimes() {
        return HitTimes;
    }

    public void setHitTimes(int hitTimes) {
        HitTimes = hitTimes;
    }

    public int getWeekHitTimes() {
        return WeekHitTimes;
    }

    public void setWeekHitTimes(int weekHitTimes) {
        WeekHitTimes = weekHitTimes;
    }

    public User() {

    }

    public User(int userId, String userName, String loweredUserName, String password, String passwordSalt, int passwordFormat, String passwordQuestion, String passwordAnswer, String privateEmail, String loseredPrivateEmail, String membershipID, String commonName, String nickName, int forceLogin, String userAccountStatus, String lastActivity, String lastAction, String IPCreated, String IPLastActivity, int databaseQuoto, int databaseQuotaUsed, int moderationLevel, int enableAvatar, int isAvatarApproved, int enabledDisplayInMemberList, int enableOnlineStatus, int enableEmail, int enableHtmlEmail, int userRankType, int userType, String publicEmail, String mobile, String weChatIM, String QQIM, String blogAddress, String facebookIM, String personalHomePage, int inviteUserId, int inviteCludId, int memberLevel, String theme, String themeApprarence, float basicPoints, float tradePoints, float rank, float profileIntegrity, int friendCount, int inviteFriendCount, int loginTimes, int hitTimes, int weekHitTimes) {
        UserId = userId;
        UserName = userName;
        LoweredUserName = loweredUserName;
        Password = password;
        PasswordSalt = passwordSalt;
        PasswordFormat = passwordFormat;
        PasswordQuestion = passwordQuestion;
        PasswordAnswer = passwordAnswer;
        PrivateEmail = privateEmail;
        LoseredPrivateEmail = loseredPrivateEmail;
        MembershipID = membershipID;
        CommonName = commonName;
        NickName = nickName;
        ForceLogin = forceLogin;
        UserAccountStatus = userAccountStatus;
        LastActivity = lastActivity;
        LastAction = lastAction;
        this.IPCreated = IPCreated;
        this.IPLastActivity = IPLastActivity;
        DatabaseQuoto = databaseQuoto;
        DatabaseQuotaUsed = databaseQuotaUsed;
        ModerationLevel = moderationLevel;
        EnableAvatar = enableAvatar;
        IsAvatarApproved = isAvatarApproved;
        EnabledDisplayInMemberList = enabledDisplayInMemberList;
        EnableOnlineStatus = enableOnlineStatus;
        EnableEmail = enableEmail;
        EnableHtmlEmail = enableHtmlEmail;
        UserRankType = userRankType;
        UserType = userType;
        PublicEmail = publicEmail;
        Mobile = mobile;
        WeChatIM = weChatIM;
        this.QQIM = QQIM;
        this.blogAddress = blogAddress;
        this.facebookIM = facebookIM;
        PersonalHomePage = personalHomePage;
        InviteUserId = inviteUserId;
        InviteCludId = inviteCludId;
        MemberLevel = memberLevel;
        Theme = theme;
        ThemeApprarence = themeApprarence;
        BasicPoints = basicPoints;
        TradePoints = tradePoints;
        Rank = rank;
        ProfileIntegrity = profileIntegrity;
        FriendCount = friendCount;
        InviteFriendCount = inviteFriendCount;
        LoginTimes = loginTimes;
        HitTimes = hitTimes;
        WeekHitTimes = weekHitTimes;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", LoweredUserName='" + LoweredUserName + '\'' +
                ", Password='" + Password + '\'' +
                ", PasswordSalt='" + PasswordSalt + '\'' +
                ", PasswordFormat=" + PasswordFormat +
                ", PasswordQuestion='" + PasswordQuestion + '\'' +
                ", PasswordAnswer='" + PasswordAnswer + '\'' +
                ", PrivateEmail='" + PrivateEmail + '\'' +
                ", LoseredPrivateEmail='" + LoseredPrivateEmail + '\'' +
                ", MembershipID='" + MembershipID + '\'' +
                ", CommonName='" + CommonName + '\'' +
                ", NickName='" + NickName + '\'' +
                ", ForceLogin=" + ForceLogin +
                ", UserAccountStatus='" + UserAccountStatus + '\'' +
                ", LastActivity='" + LastActivity + '\'' +
                ", LastAction='" + LastAction + '\'' +
                ", IPCreated='" + IPCreated + '\'' +
                ", IPLastActivity='" + IPLastActivity + '\'' +
                ", DatabaseQuoto=" + DatabaseQuoto +
                ", DatabaseQuotaUsed=" + DatabaseQuotaUsed +
                ", ModerationLevel=" + ModerationLevel +
                ", EnableAvatar=" + EnableAvatar +
                ", IsAvatarApproved=" + IsAvatarApproved +
                ", EnabledDisplayInMemberList=" + EnabledDisplayInMemberList +
                ", EnableOnlineStatus=" + EnableOnlineStatus +
                ", EnableEmail=" + EnableEmail +
                ", EnableHtmlEmail=" + EnableHtmlEmail +
                ", UserRankType=" + UserRankType +
                ", UserType=" + UserType +
                ", PublicEmail='" + PublicEmail + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", WeChatIM='" + WeChatIM + '\'' +
                ", QQIM='" + QQIM + '\'' +
                ", blogAddress='" + blogAddress + '\'' +
                ", facebookIM='" + facebookIM + '\'' +
                ", PersonalHomePage='" + PersonalHomePage + '\'' +
                ", InviteUserId=" + InviteUserId +
                ", InviteCludId=" + InviteCludId +
                ", MemberLevel=" + MemberLevel +
                ", Theme='" + Theme + '\'' +
                ", ThemeApprarence='" + ThemeApprarence + '\'' +
                ", BasicPoints=" + BasicPoints +
                ", TradePoints=" + TradePoints +
                ", Rank=" + Rank +
                ", ProfileIntegrity=" + ProfileIntegrity +
                ", FriendCount=" + FriendCount +
                ", InviteFriendCount=" + InviteFriendCount +
                ", LoginTimes=" + LoginTimes +
                ", HitTimes=" + HitTimes +
                ", WeekHitTimes=" + WeekHitTimes +
                '}';
    }
}
