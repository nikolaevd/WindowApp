/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.model.set;

public class EmployeeSet {
    
    public boolean setData(String id, String name, String age, String gender, String address, String phone, String passport, String position_id){
        
        String sql = "INSERT INTO employees (id, name, age, gender, address, " + 
                "phone, passport, position_id) VALUES (" + id + "," + 
                "'" + name + "', " + age + ", '" + gender + "'," +
                "'" + address + "', '" + phone + "', '" + passport + "', " + position_id + ");";
        
        SetData setData = new SetData();
        return setData.execute(sql);
    } 
    
}
