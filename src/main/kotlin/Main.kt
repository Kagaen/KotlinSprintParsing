import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()
    println(doc.title())

    // #Welcome_ti_Wikipedia
    // .MainPageBG
    // a
    val newsHeadLines: Elements = doc.select("#mp-itn b a")
//    println(newsHeadLines)

    for (headLine: Element in newsHeadLines) {
        println("${headLine.attr("title")}\n\t${headLine.absUrl("href")}")
    }

}

//Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
//log(doc.title());
//Elements newsHeadlines = doc.select("#mp-itn b a");
//for (Element headline : newsHeadlines) {
//    log("%s\n\t%s",
//        headline.attr("title"), headline.absUrl("href"));
//}