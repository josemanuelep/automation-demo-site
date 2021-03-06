package co.com.choucair.certification.demosite.model;

public class User {
    private String fname;
    private String lname;
    private String address;
    private String phone;
    private String email;
    private String gender;
    private String hobbies;
    private String languajes;
    private String skills;
    private String country;
    private String date;
    private String password;
    private String[] dates;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getLanguajes() {
        return languajes;
    }

    public String getSkills() {
        return skills;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;

    }

    public String getDay() {
        dates = date.split("/");
        return dates[0];
    }
    public String getMonth() {
        dates = date.split("/");
        return dates[1];
    }
    public String getYear() {
        dates = date.split("/");
        return dates[2];
    }


    public String getPassword() {
        return password;
    }
}
