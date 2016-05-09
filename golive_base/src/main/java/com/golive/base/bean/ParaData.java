package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


public class ParaData {
    @XStreamAsAttribute
    private String phone;            //联系电话
    @XStreamAsAttribute
    private String content;            //问题内容
    @XStreamAsAttribute
    private String channelcode;        //频道code
    @XStreamAsAttribute
    private String categorycode;    //分类code
    @XStreamAsAttribute
    private String categorytypecode;//分类类型code
    @XStreamAsAttribute
    private String speed;            //网络速度，单位kbps
    @XStreamAsAttribute
    private String utype;            //1-电话 2-邮箱
    @XStreamAsAttribute
    private String starttime;        //开始时间
    @XStreamAsAttribute
    private String endtime;            //结束时间
    @XStreamAsAttribute
    private String voteid;          //互动投票问题ID
    @XStreamAsAttribute
    private String voteitemid;      //互动投票选项ID
    @XStreamAsAttribute
    private String startseq;        //起始序号
    @XStreamAsAttribute
    private String limit;           //页记录数
    //	@XStreamAsAttribute private String pageno;          //页码
//	@XStreamAsAttribute private String pagesize;        //页记录数
    @XStreamAsAttribute
    private String maxsize;            //当前要获取的记录总数
    @XStreamAsAttribute
    private String livetype;        //直播剧类型
    @XStreamAsAttribute
    private String wikiid;
    @XStreamAsAttribute
    private String filmid;            //视频id
    @XStreamAsAttribute
    private String validateurl;        //欢网验证地址
    @XStreamAsAttribute
    private String manufacturer;    //会员类型（如：比亚迪、杰科）
    //@XStreamAsAttribute private String exceptioncode ;	//终端异常编码
    @XStreamAsAttribute
    private String maxmsgid;
    @XStreamAsAttribute
    private String loginuser;            //用户名
    @XStreamAsAttribute
    private String password;            //密码
    @XStreamAsAttribute
    private String repassword;            //密码确认
    @XStreamAsAttribute
    private String newpassword;        //新密码
    @XStreamAsAttribute
    private String renewpassword;        //新密码确认
    @XStreamAsAttribute
    private String username;            //用户
    @XStreamAsAttribute
    private String usermail;            //用户邮箱
    @XStreamAsAttribute
    private String usernametype;        //用户别名类型
    @XStreamAsAttribute
    private String type;                //用户收藏频道操作类型，1表示添加、2为删除、3全部删除
    @XStreamAsAttribute
    private String sex;                //性别
    @XStreamAsAttribute
    private String filmcode;
    @XStreamAsAttribute
    private String tags;
    @XStreamAsAttribute
    private String filmtype;
    @XStreamAsAttribute
    private String playtype;
    @XStreamAsAttribute
    private String resourcename;
    @XStreamAsAttribute
    private String orderserialno;
    @XStreamAsAttribute
    private String licenseid;
    @XStreamAsAttribute
    private String ticketstring;
    @XStreamAsAttribute
    private String status;              //电影票操作状态
    @XStreamAsAttribute
    private String progressrate;        //播放下载电影进度
    @XStreamAsAttribute
    private String email;
    @XStreamAsAttribute
    private String identifyingcode;    //短信验证码
    @XStreamAsAttribute
    private String registertype;        //注册类型
    @XStreamAsAttribute
    private String customid;            //用户别名
    @XStreamAsAttribute
    private String lang;                //语言
    @XStreamAsAttribute
    private String nowdate;            //当地当前时间

    @XStreamAsAttribute
    private String versionname;        //版本名称
    @XStreamAsAttribute
    private String versioncode;        //版本编号
    @XStreamAsAttribute
    private String platformcode;        //平台编码
    @XStreamAsAttribute
    private String operatecoin;
    @XStreamAsAttribute
    private String datumcoin;
    @XStreamAsAttribute
    private String packagecode;
    @XStreamAsAttribute
    private String packagename;
    @XStreamAsAttribute
    private String account;
    @XStreamAsAttribute
    private String module;
    @XStreamAsAttribute
    private String operatecode;
    @XStreamAsAttribute
    private String operatename;
    @XStreamAsAttribute
    private String operatecontent;
    @XStreamAsAttribute
    private String commodityid;
    @XStreamAsAttribute
    private String programid;
    @XStreamAsAttribute
    private String duration;
    @XStreamAsAttribute
    private String logintime;
    @XStreamAsAttribute
    private String logouttime;
    @XStreamAsAttribute
    private String key;
    @XStreamAsAttribute
    private String typecode;
    @XStreamAsAttribute
    private String keywords;
    @XStreamAsAttribute
    private String checkcode;
    @XStreamAsAttribute
    private String rank;
    @XStreamAsAttribute
    private String lockpassword;

    @XStreamAsAttribute
    private String exceptioncode;
    @XStreamAsAttribute
    private String exceptionmsg;
    @XStreamAsAttribute
    private String exceptiontype;
    @XStreamAsAttribute
    private String exceptionlevel;

    /**
     * 观影信息
     */
    @XStreamAsAttribute
    private String partnerid;
    @XStreamAsAttribute
    private String movieid;
    @XStreamAsAttribute
    private String watchduration;
    @XStreamAsAttribute
    private String playduration;
    @XStreamAsAttribute
    private String schedule;
    @XStreamAsAttribute
    private String totalduration;
    @XStreamAsAttribute
    private String watchtype;

    @XStreamAsAttribute
    private String name;
    @XStreamAsAttribute
    private String platform;    //设备平台
    @XStreamAsAttribute
    private String code;

    @XStreamAsAttribute
    private String width;
    @XStreamAsAttribute
    private String height;
    @XStreamAsAttribute
    private String density;
    @XStreamAsAttribute
    private String scaleddensity;
    @XStreamAsAttribute
    private String xdpi;
    @XStreamAsAttribute
    private String ydpi;

    @XStreamAsAttribute
    private String channelstart;            //起始序号
    @XStreamAsAttribute
    private String channellimit;            //页记录数
    @XStreamAsAttribute
    private String filmstart;                //起始序号
    @XStreamAsAttribute
    private String filmlimit;            //页记录数
    @XStreamAsAttribute
    private String packagestart;            //起始序号
    @XStreamAsAttribute
    private String packagelimit;            //页记录数

    @XStreamAsAttribute
    private String privateData;             //私有数据，预留双方可自定义的数据
    @XStreamAsAttribute
    private String sn;                      //设备广电序列号

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getprivateData() {
        return privateData;
    }

    public void setprivateData(String privateData) {
        this.privateData = privateData;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    public String getCategorycode() {
        return categorycode;
    }

    public void setCategorycode(String categorycode) {
        this.categorycode = categorycode;
    }

    public String getCategorytypecode() {
        return categorytypecode;
    }

    public void setCategorytypecode(String categorytypecode) {
        this.categorytypecode = categorytypecode;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getVoteid() {
        return voteid;
    }

    public void setVoteid(String voteid) {
        this.voteid = voteid;
    }

    public String getVoteitemid() {
        return voteitemid;
    }

    public void setVoteitemid(String voteitemid) {
        this.voteitemid = voteitemid;
    }

    public String getStartseq() {
        return startseq;
    }

    public void setStartseq(String startseq) {
        this.startseq = startseq;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    //	public String getPageno() {
//		return pageno;
//	}
//	public void setPageno(String pageno) {
//		this.pageno = pageno;
//	}
//	public String getPagesize() {
//		return pagesize;
//	}
//	public void setPagesize(String pagesize) {
//		this.pagesize = pagesize;
//	}
    public String getMaxsize() {
        return maxsize;
    }

    public void setMaxsize(String maxsize) {
        this.maxsize = maxsize;
    }

    public String getLivetype() {
        return livetype;
    }

    public void setLivetype(String livetype) {
        this.livetype = livetype;
    }

    public String getWikiid() {
        return wikiid;
    }

    public void setWikiid(String wikiid) {
        this.wikiid = wikiid;
    }

    public void setWiki_id(String wikiId) {
        wikiid = wikiId;
    }

    public String getFilmid() {
        return filmid;
    }

    public void setFilmid(String filmid) {
        this.filmid = filmid;
    }

    public String getValidateurl() {
        return validateurl;
    }

    public void setValidateurl(String validateurl) {
        this.validateurl = validateurl;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getExceptioncode() {
        return exceptioncode;
    }

    public void setExceptioncode(String exceptioncode) {
        this.exceptioncode = exceptioncode;
    }

    public String getMaxmsgid() {
        return maxmsgid;
    }

    public void setMaxmsgid(String maxmsgid) {
        this.maxmsgid = maxmsgid;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getRenewpassword() {
        return renewpassword;
    }

    public void setRenewpassword(String renewpassword) {
        this.renewpassword = renewpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    public String getUsernametype() {
        return usernametype;
    }

    public void setUsernametype(String usernametype) {
        this.usernametype = usernametype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFilmcode() {
        return filmcode;
    }

    public void setFilmcode(String filmcode) {
        this.filmcode = filmcode;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getFilmtype() {
        return filmtype;
    }

    public void setFilmtype(String filmtype) {
        this.filmtype = filmtype;
    }

    public String getPlaytype() {
        return playtype;
    }

    public void setPlaytype(String playtype) {
        this.playtype = playtype;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public String getOrderserialno() {
        return orderserialno;
    }

    public void setOrderserialno(String orderserialno) {
        this.orderserialno = orderserialno;
    }

    public String getLicenseid() {
        return licenseid;
    }

    public void setLicenseid(String licenseid) {
        this.licenseid = licenseid;
    }

    public String getTicketstring() {
        return ticketstring;
    }

    public void setTicketstring(String ticketstring) {
        this.ticketstring = ticketstring;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProgressrate() {
        return progressrate;
    }

    public void setProgressrate(String progressrate) {
        this.progressrate = progressrate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentifyingcode() {
        return identifyingcode;
    }

    public void setIdentifyingcode(String identifyingcode) {
        this.identifyingcode = identifyingcode;
    }

    public String getRegistertype() {
        return registertype;
    }

    public void setRegistertype(String registertype) {
        this.registertype = registertype;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getNowdate() {
        return nowdate;
    }

    public void setNowdate(String nowdate) {
        this.nowdate = nowdate;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    public String getVersioncode() {
        return versioncode;
    }

    public void setVersioncode(String versioncode) {
        this.versioncode = versioncode;
    }

    public String getPlatformcode() {
        return platformcode;
    }

    public void setPlatformcode(String platformcode) {
        this.platformcode = platformcode;
    }

    public String getOperatecoin() {
        return operatecoin;
    }

    public void setOperatecoin(String operatecoin) {
        this.operatecoin = operatecoin;
    }

    public String getDatumcoin() {
        return datumcoin;
    }

    public void setDatumcoin(String datumcoin) {
        this.datumcoin = datumcoin;
    }

    public String getPackagecode() {
        return packagecode;
    }

    public void setPackagecode(String packagecode) {
        this.packagecode = packagecode;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getOperatecode() {
        return operatecode;
    }

    public void setOperatecode(String operatecode) {
        this.operatecode = operatecode;
    }

    public String getOperatename() {
        return operatename;
    }

    public void setOperatename(String operatename) {
        this.operatename = operatename;
    }

    public String getOperatecontent() {
        return operatecontent;
    }

    public void setOperatecontent(String operatecontent) {
        this.operatecontent = operatecontent;
    }

    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid;
    }

    public String getProgramid() {
        return programid;
    }

    public void setProgramid(String programid) {
        this.programid = programid;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public String getLogouttime() {
        return logouttime;
    }

    public void setLogouttime(String logouttime) {
        this.logouttime = logouttime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLockpassword() {
        return lockpassword;
    }

    public void setLockpassword(String lockpassword) {
        this.lockpassword = lockpassword;
    }

    public String getExceptionmsg() {
        return exceptionmsg;
    }

    public void setExceptionmsg(String exceptionmsg) {
        this.exceptionmsg = exceptionmsg;
    }

    public String getExceptiontype() {
        return exceptiontype;
    }

    public void setExceptiontype(String exceptiontype) {
        this.exceptiontype = exceptiontype;
    }

    public String getExceptionlevel() {
        return exceptionlevel;
    }

    public void setExceptionlevel(String exceptionlevel) {
        this.exceptionlevel = exceptionlevel;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getWatchduration() {
        return watchduration;
    }

    public void setWatchduration(String watchduration) {
        this.watchduration = watchduration;
    }

    public String getPlayduration() {
        return playduration;
    }

    public void setPlayduration(String playduration) {
        this.playduration = playduration;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getTotalduration() {
        return totalduration;
    }

    public void setTotalduration(String totalduration) {
        this.totalduration = totalduration;
    }

    public String getWatchtype() {
        return watchtype;
    }

    public void setWatchtype(String watchtype) {
        this.watchtype = watchtype;
    }

    public String getChannelstart() {
        return channelstart;
    }

    public void setChannelstart(String channelstart) {
        this.channelstart = channelstart;
    }

    public String getChannellimit() {
        return channellimit;
    }

    public void setChannellimit(String channellimit) {
        this.channellimit = channellimit;
    }

    public String getFilmstart() {
        return filmstart;
    }

    public void setFilmstart(String filmstart) {
        this.filmstart = filmstart;
    }

    public String getFilmlimit() {
        return filmlimit;
    }

    public void setFilmlimit(String filmlimit) {
        this.filmlimit = filmlimit;
    }

    public String getPackagestart() {
        return packagestart;
    }

    public void setPackagestart(String packagestart) {
        this.packagestart = packagestart;
    }

    public String getPackagelimit() {
        return packagelimit;
    }

    public void setPackagelimit(String packagelimit) {
        this.packagelimit = packagelimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getScaleddensity() {
        return scaleddensity;
    }

    public void setScaleddensity(String scaleddensity) {
        this.scaleddensity = scaleddensity;
    }

    public String getXdpi() {
        return xdpi;
    }

    public void setXdpi(String xdpi) {
        this.xdpi = xdpi;
    }

    public String getYdpi() {
        return ydpi;
    }

    public void setYdpi(String ydpi) {
        this.ydpi = ydpi;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }
}