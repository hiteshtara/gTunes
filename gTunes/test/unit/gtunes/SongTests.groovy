package gtunes



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Song)
class SongTests {

    void testSomething() {
      mock Song
	  def song= new Song(title:'some title',artist:'some artist',duration:0)
	  assert!song.validate();
	  assert 'min'==song.errors['duration']
    }
}
