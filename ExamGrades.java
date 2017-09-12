class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  
  //TEMPLATE
  /*Fields:
   *  ...this.grades... 
   * 
  */
  
  //-> int
  // Returns the highest grade in this array of grades
  
  double highestGrade(){
    double temp= 0.0;
    for(int i = 0; i < this.grades.length; i++){
      if(grades[i] > temp){
        temp = grades[i];
      }
    }
    return temp;
  }
}
