// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

class Members
{
    String name;
    String userId;
    String password;
    String emailId;
    int temp;
    int[] bookIssuedNo;
    
    Members() {
        this.temp = -1;
        this.bookIssuedNo = new int[6];
        this.name = null;
        this.userId = null;
        this.password = null;
        this.emailId = null;
    }
}
