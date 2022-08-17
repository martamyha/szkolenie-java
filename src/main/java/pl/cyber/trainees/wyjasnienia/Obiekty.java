
package pl.cyber.trainees.wyjasnienia;

        import java.util.ArrayList;
        import java.util.List;

/**
 * @author Mariusz Tański
 */

/**public class Obiekty {
*
*    private void wyswietlTalkDTO() {
*        List<String> list = new ArrayList<>();
*        list.add("przyklad1");
*
*        TalkDTO talkDTO = new TalkDTO("Obiektowsc", "Operacje na obiektach", list);
*        System.out.println(talkDTO.toString());
*        System.out.println("Dziś zajmujemy się tematem: " + talkDTO.getTematRozmowy());
*
*        System.out.println(talkDTO.getTematRozmowy());
*        System.out.println(talkDTO.opis);
*
*        talkDTO.opis = "";
*
*        System.out.println(talkDTO.getTematRozmowy());
*        System.out.println(talkDTO.getOpis());
*
*        talkDTO.setOpis("12314521");
*
*        System.out.println(talkDTO.getTematRozmowy());
*        System.out.println(talkDTO.getOpis());
*
*
*
*        System.out.println(talkDTO.getPrzyklady());
*
*    Dodawanie do parametru listy nowych wartości ver1
*
*        List<String> wiecej = new ArrayList<>();
*        wiecej.add("przyklad2");
*        wiecej.add("przyklad3");
*
*        talkDTO.modifyList(wiecej);
*
*        System.out.println(talkDTO.getPrzyklady());
*
*        //    Dodawanie do parametru listy nowych wartości ver2
*        List<String> wiecej2 = new ArrayList<>();
*        wiecej2.addAll(talkDTO.getPrzyklady());
*        wiecej2.add("przyklad4");
*
*        talkDTO.setPrzyklady(wiecej2);
*
*        System.out.println(talkDTO.getPrzyklady());
*
*        //    Dodawanie do parametru listy nowych wartości ver3
*        //    TalkDTO talkDTOv2 = new TalkDTO(talkDTO.getTematRozmowy(), talkDTO.getOpis(), wiecej2);
*        //
*        //    System.out.println(talkDTOv2.getPrzyklady());
*        talkDTO = new TalkDTO(talkDTO.getTematRozmowy(), talkDTO.getOpis(), wiecej2);
*
*        System.out.println(talkDTO.getPrzyklady());
*    }
*
*    public void uruchom() {
*        wyswietlTalkDTO();
*    }
}
*/
