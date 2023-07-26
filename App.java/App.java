public class App {

  /**
 * @param args
 * @throws Exception
 * @throws ExtEmpty
 */
public static void main(String[] args) throws Exception, ExtEmpty {
    String s = new ConsoleIO().toString();

    int num_tokens = 6;
    String[] tokens = s.split(" ");
    // проверка на количество данных
    CheckPar check = new CheckPar();
    check.setArr(tokens);
    check.setNum_par(num_tokens);
    var err = check.Qn();
    switch (err) {
      case -1:
        System.out.println("Количество параметров больше необходимых");
        break;
      case -2:
        System.out.println("Количество параметров меньше необходимых");
        break;
    }
    //
    String[] resstr = new String[6];
    // парсинг даты
    ParseDate pd = new ParseDate();
    pd.setArr(tokens);
    int indexdate = pd.getDate();
    if (indexdate >= 0) {
      resstr[3] = tokens[indexdate];
    } else {
      throw new RuntimeException("Date of birth not found!");
    }

    // парсинг телефона
    ParseTel pt = new ParseTel();
    pt.setArr(tokens);
    int indextel = pt.getTel();
    if (indextel >= 0) {
      resstr[4] = tokens[indextel];
    } else {
      throw new RuntimeException("Telephone not found!");
    }
    // парсинг пола
    ParseSex ps = new ParseSex();
    ps.setArr(tokens);
    int indexsex = ps.getSex();
    if (indexsex >= 0) {
      resstr[5] = tokens[indexsex];
    } else {
      throw new RuntimeException("Sex not parsed!");
    }

    // запись в файл
    for (int i = 0; i < 3; i++) {
      resstr[i] = tokens[i];
    }
    SaveFile sf = new SaveFile();
    sf.setData(resstr);
    sf.setPath(resstr[0] + ".txt");
    sf.save();
  }

}