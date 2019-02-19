/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Medul
 */
public class DonarModel {

    private int Id;
    private String name;
    private String email;
    private String address;
    private String phn;
    private String dateOfBirth;
    private String age;
    private String sex;
    private String bloodGroup;
    private String lastDonate;
    private String status;

    public DonarModel() {

    }

    public DonarModel(int Id, String name, String email, String address, String phn, String dateOfBirth, String age, String sex, String bloodGroup, String lastDonate, String status) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phn = phn;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.sex = sex;
        this.bloodGroup = bloodGroup;
        this.lastDonate = lastDonate;
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn =phn;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getLastDonate() {
        return lastDonate;
    }

    public void setLastDonate(String lastDonate) {
        this.lastDonate = lastDonate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String sex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
