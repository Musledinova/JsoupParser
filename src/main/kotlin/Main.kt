import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

const val URL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

fun main() {
    val doc: Document = Jsoup.connect(URL).get()

    val quote = doc.select("article")

    for (quotes: Element in quote) {
        println("* ${quotes.text()}")
    }

}
