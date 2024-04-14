public class StudentGroup {
    public String nazwa;
    public Student[] studenci;
    public int liczbaStudentow;

    public void dodajStudentaDoGrupy(Student student){
        if(liczbaStudentow>=15){
            throw new IllegalStateException("Grupa nie jest pełna");
        }
        for(int i=0;i<liczbaStudentow;i++){
            if(studenci[i]==student){
                throw new IllegalStateException("Student już należy do tej grupy");
            }
        }
        studenci[liczbaStudentow++]=student;
    }
}
