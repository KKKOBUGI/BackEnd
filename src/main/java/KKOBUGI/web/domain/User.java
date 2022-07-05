package KKOBUGI.web.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    @NotNull
    private Long id;

    private String login_Id;
    private String login_Pw;
    private String nickname;

    @OneToMany(mappedBy = "user")
    private List<Board> boards = new ArrayList<>();

    public User(){}
}
