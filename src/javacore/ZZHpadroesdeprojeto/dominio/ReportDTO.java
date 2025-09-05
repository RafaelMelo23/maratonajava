package javacore.ZZHpadroesdeprojeto.dominio;

public class ReportDTO {

    private String aircraftName;
    private Country country;
    private Currency currency;
    private String personName;

    public static final class ReportDTOBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String personName;

        private ReportDTOBuilder() {
        }

        public static ReportDTOBuilder builder() {
            return new ReportDTOBuilder();
        }

        public ReportDTOBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDTOBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDTOBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDTOBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDTO build() {
            ReportDTO reportDTO = new ReportDTO();
            reportDTO.aircraftName = this.aircraftName;
            reportDTO.country = this.country;
            reportDTO.currency = this.currency;
            reportDTO.personName = this.personName;
            return reportDTO;
        }
    }


    @Override
    public String toString() {
        return "ReportDTO{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }
}
