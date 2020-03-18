// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

class Faculty extends Members
{
    Faculty() {
        this.name = null;
        this.userId = null;
        this.password = null;
        this.emailId = null;
    }
    
    Faculty(final String name, final String userId, final String password, final String emailId) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.emailId = emailId;
    }
}
