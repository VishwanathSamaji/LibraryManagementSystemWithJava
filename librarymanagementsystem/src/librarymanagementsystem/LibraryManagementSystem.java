// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

public class LibraryManagementSystem
{
    Book[] bk;
    Student[] s;
    Faculty[] f;
    int bno;
    int sno;
    int fno;
    
    public LibraryManagementSystem() {
        this.bk = new Book[100];
        this.s = new Student[100];
        this.f = new Faculty[100];
        this.bno = -1;
        this.sno = -1;
        this.fno = -1;
    }
    
    public static void main(final String[] args) {
        final Welcome w = new Welcome();
    }
}
