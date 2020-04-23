CXXFLAGS_append_sh4 += " -std=c++11 -fPIC -fno-strict-aliasing "

DEPENDS_append_sh4 += "\
	libmme-image libmme-host \
	"

RDEPENDS_${PN}_append_sh4 += "\
	libmme-host \
        alsa-utils-amixer-conf \
	"

EXTRA_OECONF_append_sh4 += "\
	--enable-${MACHINE} --with-lcd \
        "
SRC_URI_sh4 = "${GITHUB_URI}/BarviX6/enigma2-openpli.git;branch=develop"
