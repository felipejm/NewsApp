package com.bonial.features.articles.feed

import okhttp3.mockwebserver.MockResponse

object ArticleRequestHelper {

    fun createSuccessResponse(): MockResponse {
        return MockResponse().setBody("{\n" +
                "   \"status\":\"ok\",\n" +
                "   \"totalResults\":38,\n" +
                "   \"articles\":[\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Youtube.com\"\n" +
                "         },\n" +
                "         \"author\":null,\n" +
                "         \"title\":\"Kawhi rejected LeBron and used the Lakers for leverage – Pablo Torre | High Noon - ESPN\",\n" +
                "         \"description\":\"Pablo Torre weighs in on Kawhi Leonard’s secret moves during free agency that resulted in Paul George being traded from the Oklahoma City Thunder to the LA C...\",\n" +
                "         \"url\":\"https://www.youtube.com/watch?v=wlow3Be2BfA\",\n" +
                "         \"urlToImage\":\"https://i.ytimg.com/vi/wlow3Be2BfA/hqdefault.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T15:15:00Z\",\n" +
                "         \"content\":\"Pablo Torre weighs in on Kawhi Leonards secret moves during free agency that resulted in Paul George being traded from the Oklahoma City Thunder to the LA Clippers. \\r\\nSubscribe to ESPN+ https://plus.espn.com/Get the ESPN App: http://www.espn.com/espn/apps/esp… [+737 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Washingtonexaminer.com\"\n" +
                "         },\n" +
                "         \"author\":\"https://www.washingtonexaminer.com/author/susan-ferrechio\",\n" +
                "         \"title\":\"Democrats escalate battle with Trump with a dozen new subpoenas - Washington Examiner\",\n" +
                "         \"description\":\"House Democrats will vote Thursday to subpoena a dozen Trump administration officials, including Jared Kushner, in a move that will escalate the party’s battle with the president.\",\n" +
                "         \"url\":\"https://www.washingtonexaminer.com/news/congress/democrats-escalate-battle-with-trump-with-a-dozen-new-subpoenas\",\n" +
                "         \"urlToImage\":\"https://mediadc.brightspotcdn.com/dims4/default/09edf77/2147483647/strip/true/crop/2290x1202+0+54/resize/1200x630!/quality/90/?url=https%3A%2F%2Fmediadc.brightspotcdn.com%2F94%2F4a%2F6eabd8a2417292f8709836030eae%2Fdonald-trump-jerry-nadler.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T15:12:00Z\",\n" +
                "         \"content\":\"House Democrats will vote Thursday to subpoena a dozen Trump administration officials, including Jared Kushner, in a move that will escalate the partys battle with the president.\\r\\nHouse Judiciary Committee Chairman Jerry Nadler announced his panel will vote t… [+1249 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Dreadcentral.com\"\n" +
                "         },\n" +
                "         \"author\":\"Josh Millican\",\n" +
                "         \"title\":\"Is Sarah Paulson Sitting Out the Next Season of AMERICAN HORROR STORY? - Dread Central\",\n" +
                "         \"description\":\"If history is any indicator, the next season of American Horror Story will debut around late September in order to wrap before the end of the year holidays. Of course, if history were an indicator, Sarah Paulson would have a starring role in the upcoming, sla…\",\n" +
                "         \"url\":\"https://www.dreadcentral.com/news/296950/is-sarah-paulson-sitting-out-the-next-season-of-american-horror-story/\",\n" +
                "         \"urlToImage\":\"https://www.dreadcentral.com/wp-content/uploads/2019/04/AHS-1984-Banner-1000x563.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T15:00:55Z\",\n" +
                "         \"content\":\"If history is any indicator, the next season of American Horror Story will debut around late September in order to wrap before the end of the year holidays. Of course, if history were an indicator, Sarah Paulson would have a starring role in the upcoming, sla… [+1012 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Cnet.com\"\n" +
                "         },\n" +
                "         \"author\":\"Oscar Gonzalez\",\n" +
                "         \"title\":\"Apple kills \$999 MacBook Air and 12-inch MacBook - CNET\",\n" +
                "         \"description\":\"Apple just raised the starting price of buying a Mac.\",\n" +
                "         \"url\":\"https://www.cnet.com/news/apple-kills-999-macbook-air-and-12-inch-macbook/\",\n" +
                "         \"urlToImage\":\"https://cnet2.cbsistatic.com/img/bWQOyu4TX3lsvaa6PoeT0Fd0uFs=/756x567/2017/06/21/cd7d93a0-24b8-431c-8f5e-cfed4ff277f0/apple-macbook-12-inch-2017-03.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T14:43:23Z\",\n" +
                "         \"content\":\"The 12-inch MacBook is no more. \\r\\nSarah Tew/CNET\\r\\nAppleupgraded its newest MacBook Air and MacBook Pro laptops on Tuesday, but it looks like two notebooks have vanished from the company's site. The smallest of the MacBooks and the cheapest MacBook Air are now… [+1833 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Aol.com\"\n" +
                "         },\n" +
                "         \"author\":\"Rachel Kleinman\",\n" +
                "         \"title\":\"Texas billionaire H. Ross Perot dies aged 89 - AOL\",\n" +
                "         \"description\":\"H. Ross Perot, the colorful, self-made Texas billionaire who twice ran for president, has died, a family spokesperson confirmed.\",\n" +
                "         \"url\":\"https://www.aol.com/article/news/2019/07/09/texas-billionaire-h-ross-perot-dies-aged-89/23766879/\",\n" +
                "         \"urlToImage\":\"https://o.aolcdn.com/images/dims3/GLOB/crop/3001x1967+0+47/resize/1028x675!/format/jpg/quality/85/https%3A%2F%2Fs.yimg.com%2Fos%2Fcreatr-images%2F2019-07%2F30d9d460-a256-11e9-bf97-c633e757d33d\",\n" +
                "         \"publishedAt\":\"2019-07-09T14:32:12Z\",\n" +
                "         \"content\":\"DALLAS (AP) H. Ross Perot (pur-OH'), the colorful, self-made Texas billionaire who twice ran for president, has died.\\r\\nFamily spokesman James Fuller says Perot died early Tuesday. He was 89.\\r\\nPerot rose from Depression-era poverty to become one of the nation'… [+19076 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":\"the-verge\",\n" +
                "            \"name\":\"The Verge\"\n" +
                "         },\n" +
                "         \"author\":\"Jon Porter\",\n" +
                "         \"title\":\"Dr. Mario World releases a day early on iOS - The Verge\",\n" +
                "         \"description\":\"Dr. Mario World is available now for iOS. Nintendo’s latest smartphone game was originally meant to come out on July 10th. However, it appears to have gone live a day early for Apple devices.\",\n" +
                "         \"url\":\"https://www.theverge.com/2019/7/9/20687499/dr-mario-world-ios-released-android-nintendo-smartphone-game\",\n" +
                "         \"urlToImage\":\"https://cdn.vox-cdn.com/thumbor/m6yDaCih40EWAF0lrrfgAz3aF1I=/0x86:1200x714/fit-in/1200x630/cdn.vox-cdn.com/uploads/chorus_asset/file/18287445/Untitled.png\",\n" +
                "         \"publishedAt\":\"2019-07-09T14:28:57Z\",\n" +
                "         \"content\":\"Image: Nintendo\\r\\nDr. Mario World is available now for iOS. Nintendos latest smartphone game was originally slated to come out on July 10th, but Twitter user @Wario64 notes that the download has gone live a day early for Apple devices. As of time of publicatio… [+1026 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":\"cnn\",\n" +
                "            \"name\":\"CNN\"\n" +
                "         },\n" +
                "         \"author\":\"David Wright, CNN\",\n" +
                "         \"title\":\"Tom Steyer officially announces presidential bid - CNN\",\n" +
                "         \"description\":\"Billionaire Tom Steyer officially entered the presidential race on Tuesday, saying he would seek the Democratic nomination for president despite having previously ruled out a run in January.\",\n" +
                "         \"url\":\"https://www.cnn.com/2019/07/09/politics/tom-steyer-presidential-campaign/index.html\",\n" +
                "         \"urlToImage\":\"https://cdn.cnn.com/cnnnext/dam/assets/190709091711-01-tom-steyer-file-01292018-super-tease.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T14:15:00Z\",\n" +
                "         \"content\":\"(CNN)Billionaire Tom Steyer officially entered the presidential race on Tuesday, saying he would seek the Democratic nomination for president despite having previously ruled out a run in January.\\r\\nIn a video released Tuesday morning, Steyer said, \\\"if you thin… [+3164 chars]\"\n" +
                "      }\n" +
                "   ]\n" +
                "}").setResponseCode(200)
    }

    fun createNextPageRequest(): MockResponse {
        return MockResponse().setBody("{\n" +
                "   \"status\":\"ok\",\n" +
                "   \"totalResults\":38,\n" +
                "   \"articles\":[\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Youtube.com\"\n" +
                "         },\n" +
                "         \"author\":null,\n" +
                "         \"title\":\"Match Point: Serena Williams vs Alison Riske Wimbledon 2019 - Wimbledon\",\n" +
                "         \"description\":\"This is the official Wimbledon YouTube page. The Championships 2019 will run from 1 July - 14 July. To join the Wimbledon story this year, visit wimbledon.co...\",\n" +
                "         \"url\":\"https://www.youtube.com/watch?v=8bFVcMenS5E\",\n" +
                "         \"urlToImage\":\"https://i.ytimg.com/vi/8bFVcMenS5E/maxresdefault.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T14:14:49Z\",\n" +
                "         \"content\":\"This is the official Wimbledon YouTube page. The Championships 2019 will run from 1 July - 14 July. To join the Wimbledon story this year, visit wimbledon.com/mywimbledon\\r\\nSUBSCRIBE to The Wimbledon YouTube Channel: http://www.youtube.com/wimbledon\\r\\nLIKE Wimb… [+345 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Aol.com\"\n" +
                "         },\n" +
                "         \"author\":\"Kamini Ramdeen\",\n" +
                "         \"title\":\"'A pompous fool': President Trump trashes U.K. ambassador who disparaged his administration - AOL\",\n" +
                "         \"description\":\"“The wacky Ambassador that the U.K. foisted upon the United States is not someone we are thrilled with, a very stupid guy,” Trump tweeted early Tuesday.\",\n" +
                "         \"url\":\"https://www.aol.com/article/news/2019/07/09/a-pompous-fool-trump-trashes-uk-ambassador-who-disparaged-his-administration/23766850/\",\n" +
                "         \"urlToImage\":\"https://o.aolcdn.com/images/dims3/GLOB/crop/4480x2938+0+0/resize/1028x675!/format/jpg/quality/85/https%3A%2F%2Fs.yimg.com%2Fos%2Fcreatr-images%2F2019-07%2F22f6ef90-a251-11e9-af67-27786e1c5e30\",\n" +
                "         \"publishedAt\":\"2019-07-09T13:56:20Z\",\n" +
                "         \"content\":\"A day after declaring the United States would no longer deal with the British ambassador who disparaged his administration, President Trump lobbed several personal insults at him on Twitter.\\r\\nThe wacky Ambassador that the U.K. foisted upon the United States i… [+5462 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":\"politico\",\n" +
                "            \"name\":\"Politico\"\n" +
                "         },\n" +
                "         \"author\":null,\n" +
                "         \"title\":\"Hong Kong leader Carrie Lam says extradition bill 'is dead' after weeks of protests - POLITICO\",\n" +
                "         \"description\":\"“There is no such plan, the bill is dead,” Hong Kong leader Carrie Lam Cheng Yuet-ngor said.\",\n" +
                "         \"url\":\"https://www.politico.com/story/2019/07/09/hong-kong-extradition-bill-carrie-lam-1402272\",\n" +
                "         \"urlToImage\":\"https://static.politico.com/9e/95/393ae89848e79c3ba9d8fa291737/190709-carrie-lam-gtty-773.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T13:52:00Z\",\n" +
                "         \"content\":\"Carrie Lam, Hong Kong's chief executive, speaks during a news conference on July 2, 2019, in Hong Kong. | Anthony Kwan/Getty Images\\r\\nThis story is being published as part of a content partnership with the South China Morning Post. It originally appeared on sc… [+4803 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Stltoday.com\"\n" +
                "         },\n" +
                "         \"author\":\"Benjamin Hochman\",\n" +
                "         \"title\":\"Hochman: Guerrero Jr. looks like 'Junior,' demolishes balls in Home Run Derby (and still loses!) - STLtoday.com\",\n" +
                "         \"description\":\"What makes the Home Run Derby isn't, simply, home runs. Because there was a point during the long broadcast, as guys homered ho-hum homers, I turned to my wife and\",\n" +
                "         \"url\":\"https://www.stltoday.com/sports/columns/benjamin-hochman/hochman-guerrero-jr-looks-like-junior-demolishes-balls-in-home/article_b60b98ba-0379-52c9-8f77-dad342415cbb.html\",\n" +
                "         \"urlToImage\":\"https://bloximages.newyork1.vip.townnews.com/stltoday.com/content/tncms/assets/v3/editorial/d/89/d89053fb-625a-5033-b815-0533a6e5bbfd/5d249c03a6708.image.jpg?crop=512%2C288%2C0%2C26&resize=512%2C288&order=crop%2Cresize\",\n" +
                "         \"publishedAt\":\"2019-07-09T13:43:00Z\",\n" +
                "         \"content\":\"What makes the Home Run Derby isn't, simply, home runs. Because there was a point during the long broadcast, as guys homered ho-hum homers, I turned to my wife and said: I'm bored.\\r\\nWhat makes the Home Run Derby is the homers that make you go Whoa! And maybe … [+2742 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":\"cnn\",\n" +
                "            \"name\":\"CNN\"\n" +
                "         },\n" +
                "         \"author\":\"Anneken Tappe, CNN Business\",\n" +
                "         \"title\":\"Stocks slide more ahead of Powell testimony - CNN\",\n" +
                "         \"description\":\"Stocks are again in the red on Monday, as investors are anxiously waiting to hear from Federal Reserve Chairman Jerome Powell.\",\n" +
                "         \"url\":\"https://www.cnn.com/2019/07/09/investing/dow-stock-market-today/index.html\",\n" +
                "         \"urlToImage\":\"https://cdn.cnn.com/cnnnext/dam/assets/190709090327-dow-stock-market-slide-super-tease.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T13:40:00Z\",\n" +
                "         \"content\":null\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":\"fox-news\",\n" +
                "            \"name\":\"Fox News\"\n" +
                "         },\n" +
                "         \"author\":\"Lukas Mikelionis\",\n" +
                "         \"title\":\"Bill Clinton 'not telling the truth' about Jeffrey Epstein, says investigative journalist who first reveale... - Fox News\",\n" +
                "         \"description\":\"Investigative journalist Conchita Sarnoff said Monday that former President Bill Clinton isn’t telling the truth when he says he knew nothing of the alleged crimes of Jeffrey Epstein.\",\n" +
                "         \"url\":\"https://www.foxnews.com/politics/bill-clinton-not-telling-truth-epstein-investigative-journalist\",\n" +
                "         \"urlToImage\":\"https://static.foxnews.com/foxnews.com/content/uploads/2019/07/epsteinclintonplane.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T13:19:01Z\",\n" +
                "         \"content\":\"Investigative journalist Conchita Sarnoff said Monday that former President Bill Clinton isn’t telling the truth when he says he \\\"knows nothing\\\" of the alleged crimes of Jeffrey Epstein.\\r\\nSarnoff, who’s the executive director of Alliance to Rescue Victims of … [+2451 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Wired.co.uk\"\n" +
                "         },\n" +
                "         \"author\":\"Sophie Charara\",\n" +
                "         \"title\":\"Google and Amazon are settling their streaming beef: YouTube's coming to Fire TV - Wired.co.uk\",\n" +
                "         \"description\":\"After months of disagreement, you'll soon be able to get YouTube on Fire TV again, plus Google's Chromecast and Android TV will support Prime Video\",\n" +
                "         \"url\":\"https://www.wired.co.uk/article/google-youtube-android-tv-amazon-fire-tv\",\n" +
                "         \"urlToImage\":\"https://wi-images.condecdn.net/image/DaXXL4bpGqk/crop/1440/0.5235602094240838/f/streaming-stick.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T13:05:13Z\",\n" +
                "         \"content\":\"Sometimes Silicon Valley stops squabbling amongst itself. As of today, Amazon and Google have lifted the ban on each others rival video services. \\r\\nThat means theres a YouTube app launching for Fire TV Stick 4K and Fire TV Stick (second gen), with other Fire … [+2407 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":\"the-washington-post\",\n" +
                "            \"name\":\"The Washington Post\"\n" +
                "         },\n" +
                "         \"author\":null,\n" +
                "         \"title\":\"Joe Biden praises son struggling with addiction and mental health: ‘Hunter is my heart’ - The Washington Post\",\n" +
                "         \"description\":\"The former vice president and Democratic presidential contender praised what he called his son's 'enormous courage.'\",\n" +
                "         \"url\":\"https://www.washingtonpost.com/politics/2019/07/09/joe-biden-praises-son-struggling-with-addiction-mental-health-hunter-is-my-heart/\",\n" +
                "         \"urlToImage\":\"https://www.washingtonpost.com/resizer/Q-9N57_6hRi88QLhjE90di3OggU=/1484x0/arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/G3WO5TFBYYI6TJ3H26VYJLXT5E.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T12:54:30Z\",\n" +
                "         \"content\":\"Joe Biden the two-term vice president and a 2020 Democratic presidential hopeful opened up about his son Hunters struggle with mental health in a CNN interview broadcast Monday evening.\\r\\nHunter is my heart Biden said, referring to his son, 49. And Hunter has … [+3577 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":\"cnn\",\n" +
                "            \"name\":\"CNN\"\n" +
                "         },\n" +
                "         \"author\":\"Marianne Garvey, CNN\",\n" +
                "         \"title\":\"Samuel L. Jackson is set to play Chris Rock's dad in a new 'Saw' - CNN\",\n" +
                "         \"description\":\"Samuel L. Jackson reportedly has joined the cast of the \\\"Saw\\\" reboot.\",\n" +
                "         \"url\":\"https://www.cnn.com/2019/07/09/entertainment/samuel-l-jackson-saw-trnd/index.html\",\n" +
                "         \"urlToImage\":\"https://cdn.cnn.com/cnnnext/dam/assets/190614053840-samuel-l-jackson-super-tease.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T12:52:00Z\",\n" +
                "         \"content\":null\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":\"cnbc\",\n" +
                "            \"name\":\"CNBC\"\n" +
                "         },\n" +
                "         \"author\":\"Jasmine Wu\",\n" +
                "         \"title\":\"Burger King adds \$1 tacos to its menu for a limited time - CNBC\",\n" +
                "         \"description\":\"Burger King announced today that it is offering \$1 tacos nationwide for a limited time. The chain had also previously served tacos on its menu around 2010.\",\n" +
                "         \"url\":\"https://www.cnbc.com/2019/07/09/burger-king-adds-1-tacos-to-its-menu-for-a-limited-time.html\",\n" +
                "         \"urlToImage\":\"https://image.cnbcfm.com/api/v1/image/106008977-156267514025104113-4_tacos_pr_images_cr.jpg?v=1562675184\",\n" +
                "         \"publishedAt\":\"2019-07-09T12:46:28Z\",\n" +
                "         \"content\":\"Burger King said Tuesday it plans to sell \$1 tacos nationwide for a limited time.\\r\\n \\\"We've seen success with tacos in our west coast restaurants and knew it was time to bring this west coast favorite nationwide,\\\" said Chris Finazzo, Burger King North America'… [+1177 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Yahoo.com\"\n" +
                "         },\n" +
                "         \"author\":\"By David Shepardson\",\n" +
                "         \"title\":\"IBM closes \$34 billion deal to buy Red Hat - Yahoo News\",\n" +
                "         \"description\":\"Underscoring the drive into high-margin businesses, IBM in October agreed to buy Red Hat, the company’s biggest acquisition in its more than 100-year history...\",\n" +
                "         \"url\":\"https://news.yahoo.com/ibm-closes-34-billion-deal-123544525.html\",\n" +
                "         \"urlToImage\":\"https://s.yimg.com/os/mit/media/m/social/images/social_default_logo-1481777.png\",\n" +
                "         \"publishedAt\":\"2019-07-09T12:35:00Z\",\n" +
                "         \"content\":\"By David Shepardson\\r\\n(Reuters) - International Business Machines Corp &lt;IBM.N&gt; said on Tuesday it has closed its \$34 billion acquisition of software company Red Hat Inc &lt;RHT.N&gt; as it looks to ramp up its cloud computing business.\\r\\nUnderscoring the … [+2264 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":\"cnn\",\n" +
                "            \"name\":\"CNN\"\n" +
                "         },\n" +
                "         \"author\":\"Analysis by Harry Enten, CNN\",\n" +
                "         \"title\":\"As Pelosi and Ocasio-Cortez battle in the House, liberals dominate 2020 - CNN\",\n" +
                "         \"description\":\"This weekend, the Democratic Party's infighting spilled over onto the pages of the New York Times' opinion section. House Speaker Nancy Pelosi went after Reps. Alexandria Ocasio-Cortez of New York, Ilhan Omar of Minnesota, Ayanna Pressley of Massachusetts and…\",\n" +
                "         \"url\":\"https://www.cnn.com/2019/07/09/politics/moderates-liberals-2020-analysis/index.html\",\n" +
                "         \"urlToImage\":\"https://cdn.cnn.com/cnnnext/dam/assets/190627174813-ocasio-cortez-pelosi-split-super-tease.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T11:21:00Z\",\n" +
                "         \"content\":\"(CNN)This weekend, the Democratic Party's infighting spilled over onto the pages of the New York Times' opinion section. House Speaker Nancy Pelosi went after Reps. Alexandria Ocasio-Cortez of New York, Ilhan Omar of Minnesota, Ayanna Pressley of Massachusett… [+4361 chars]\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"source\":{\n" +
                "            \"id\":null,\n" +
                "            \"name\":\"Fastcompany.com\"\n" +
                "         },\n" +
                "         \"author\":\"David Lidsky\",\n" +
                "         \"title\":\"Meet Matt Mason, the Mattel toy that brought space to life for boomer kids—and then disappeared - Fast Company\",\n" +
                "         \"description\":\"Mattel found savvy expats from the effort to get astronauts on the Moon to create the interplanetary future everyone dreamed of . . . for kids to play with in their sandboxes.\",\n" +
                "         \"url\":\"https://www.fastcompany.com/90373166/meet-matt-mason-the-mattel-toy-which-brought-space-to-life-for-boomer-kids-and-then-disappeared\",\n" +
                "         \"urlToImage\":\"https://images.fastcompany.net/image/upload/w_1280,f_auto,q_auto,fl_lossy/wp-cms/uploads/2019/07/p-1-90373166-matt-mason-matteland8217s-man-in-space.jpg\",\n" +
                "         \"publishedAt\":\"2019-07-09T11:00:00Z\",\n" +
                "         \"content\":\"This is the 39th in an exclusive series of 50 articles, one published each day until July 20, exploring the 50th anniversary of the first-ever Moon landing. You can check out 50 Days to the Moon here every day. \\r\\nAmid a dusty landscape anchored by a futuristi… [+7514 chars]\"\n" +
                "      }\n" +
                "   ]\n" +
                "}").setResponseCode(200)
    }
}