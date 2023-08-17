package HW5.model.data;

/*
 * если я делаю класс Юзер абстрактным то у меня весь класс контоллер 
 * подчекивается желтымб и чтобы этого небыло, мне надо его типизировать 
 * либо студентами, либо учитилями, а мне надо оба этих класса.
 * Лучше вего было бы сделать новый абстракный класс, от которого 
 * будет наследоваться Юзер, но это, вроде, нарушает какой-то принцип)))
 * Поэтому вот так, я пока не все понил в этом случае и буду благодарен за подсказку,
 * как еще можно из такой ситуации выбираться.
 */
public class User {
    private String name;
    private String surname;
    private String birthday;

    public User(String name, String surname, String birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname=" + surname + ", birthday=" + birthday;
    }

}
