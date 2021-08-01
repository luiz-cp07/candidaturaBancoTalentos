package candidaturaWeb;

import core.Driver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    WebDriver driver;
    Driver driverWeb;
    JobsPage jobsPage;
    LoginPage loginPage;
    CurriculumPage curriculumPage;
    Quiz1Page quiz1Page;
    Quiz2Page quiz2Page;
    StatusPage statusPage;

    @Before
    public void inicializaTest() {
        driverWeb = new Driver("chrome");
        driver = driverWeb.driver;
        driver.get("https://nayaracorporation.solides.jobs/");

        jobsPage = new JobsPage(driver);
        loginPage = new LoginPage(driver);
        curriculumPage = new CurriculumPage(driver);
        quiz1Page = new Quiz1Page(driver);
        quiz2Page = new Quiz2Page(driver);
        statusPage = new StatusPage(driver);
    }


    @Test
    public void primeiroTeste(){

        jobsPage.aceitarCookies();
        assertEquals("https://nayaracorporation.solides.jobs/", jobsPage.getUrlJobs());
        jobsPage.vaga();
        jobsPage.cidade();
        jobsPage.selectCidade();
        jobsPage.verVaga();
        jobsPage.candidatar();


        String login = loginPage.getLogin();
        assertEquals("E-mail ou CPF", login);
        loginPage.usuario();
        loginPage.senha();
        loginPage.btnEntrar();

        String urlCurriculum = curriculumPage.getUrlCurriculum();
        assertEquals("https://login.solides.jobs/", urlCurriculum);
        curriculumPage.telefone();
        curriculumPage.email();
        curriculumPage.confirmarEmail();
        curriculumPage.nomeCompleto();
        curriculumPage.genero();
        curriculumPage.dataNascimento();
        curriculumPage.video();
        curriculumPage.btnSalvarDados();


        String questionario1 = quiz1Page.getQuestionario1();
        assertEquals("que melhor te representam.", questionario1);
        quiz1Page.independente();
        quiz1Page.autosuficiente();
        quiz1Page.otimista();
        quiz1Page.dedicado();
        quiz1Page.eficiente();
        quiz1Page.btnProximaEtapa();

        String questionario2 = quiz2Page.getQuestionario2();
        assertEquals("que você deveria ser (atributos que você tenha ou não).", questionario2);
        quiz2Page.compreensivo();
        quiz2Page.lider();
        quiz2Page.exigente();
        quiz2Page.sincero();
        quiz2Page.idealista();
        quiz2Page.btnSalvarCandidatar();

        String status = statusPage.getStatus();
        assertEquals("Candidatura realizada com sucesso na vaga Teste da Nayara Corporation.", status);

    }

}
