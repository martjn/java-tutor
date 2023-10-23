package week9.Ex25.tools;
import week9.Ex25.tools.DuplicateRemover;
import java.util.Set;
import java.util.HashSet;

public class PersonalDuplicateRemover implements DuplicateRemover {
  private Set<String> duplicateSet = new HashSet<String>();
  private int duplicates = 0;


  public void add(String characterString){
    if(!this.duplicateSet.contains(characterString)){
      this.duplicateSet.add(characterString);
    }
    else{
      this.duplicates++;
    }
  }

  public int getNumberOfDetectedDuplicates(){
    return this.duplicates;
  }

  public Set<String> getUniqueCharacterStrings(){
    return this.duplicateSet;
  }

  public void empty(){
    this.duplicateSet.clear();
    this.duplicates = 0;
  }



}
