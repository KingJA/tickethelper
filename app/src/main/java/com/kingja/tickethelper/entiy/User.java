package com.kingja.tickethelper.entiy;

/**
 * Description:TODO
 * Create Time:2018/5/11 13:34
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class User {

    /**
     * token : 1b3d01314340847faa06da81121ad21f
     * expires_in : 2018-06-10 10:01:51
     * uid : 22
     * user : {"id":22,"name":"KingJA","email":"kingjavip@gmail.com","created_at":"2018-05-09 11:05:57",
     * "updated_at":"2018-05-09 11:05:57","role_id":"","mobile":"","address":""}
     */

    private String token;
    private String expires_in;
    private int uid;
    private UserBean user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * id : 22
         * name : KingJA
         * email : kingjavip@gmail.com
         * created_at : 2018-05-09 11:05:57
         * updated_at : 2018-05-09 11:05:57
         * role_id :
         * mobile :
         * address :
         */

        private int id;
        private String name;
        private String email;
        private String created_at;
        private String updated_at;
        private String role_id;
        private String mobile;
        private String address;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getRole_id() {
            return role_id;
        }

        public void setRole_id(String role_id) {
            this.role_id = role_id;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
