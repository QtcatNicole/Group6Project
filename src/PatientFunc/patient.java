/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientFunc;

/**
 *
 * @author 竹子
 */
public class patient {
    private String pName;
    private int pID;
    private String pUsername;
    private String pPswd;
    private String pGender; 
    
    public patient(String name,int id, String username, String pswd, String gender)
    {
        this.pName = name;
        this.pID = id;
        this.pUsername = username;
        this.pPswd = pswd;
        this.pGender = gender;
    }
    
    public String getName()
    {
        return this.pName;
    }
    
    public int getID()
    {
        return this.pID;
    }
    
    public String getUsername()
    {
        return this.pUsername;
    }
    
    public String getPswd()
    {
        return this.pPswd;
    }
    
    public String getGender()
    {
        return this.pGender;
    }
    
    public void setName(String name)
    {
        this.pName = name;
    }
    
    public void setID(int id)
    {
        this.pID = id;
    }
    
    public void setUsername(String username)
    {
        this.pUsername = username;
    }
    
    public void setPswd(String gender)
    {
        this.pGender = gender;
    }
}
