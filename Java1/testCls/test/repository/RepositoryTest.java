package repository;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RepositoryTest {
	
	@Test
	public void 회원추가기능() {
		//given
		Member member = new Member("test");
		Repository repository = new Repository();
		
		new Member("test2");
		
		Member member2 = new Member("test3");
		
		//when
		repository.addMember(member);
		
		//then
		assertThat(repository.findMemberById(member.getId())).isSameAs(member);
	}

	
	
	@Test
	public void 나누기0테스트() {
		//given
		
		//when
				
		//then
		Assertions.assertThrows(ArithmeticException.class, () -> {
			int c = 10 / 0;
		});
	}
}
