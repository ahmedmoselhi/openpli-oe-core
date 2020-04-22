CXXFLAGS_append_sh4 += " -std=c++11 -fPIC -fno-strict-aliasing "

DEPENDS_append_sh4 += "\
	libmme-image libmme-host \
	"

RDEPENDS_${PN}_append_sh4 += "\
	libmme-host \
        alsa-utils-amixer-conf \
	"

SRC_URI_sh4 = "${GITHUB_URI}/kueken/openpli-enigma2.git;branch=follow_oe"
