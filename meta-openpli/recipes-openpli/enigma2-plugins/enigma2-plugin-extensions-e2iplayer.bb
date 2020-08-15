SUMMARY = "E2i Player for E2"
DESCRIPTION = "E2i Player for E2"
SECTION = "multimedia"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/persianpros/e2iplayer.git;protocol=http \
           file://0001-Revert-This-version-is-only-for-Open-Vision.patch \
           file://0001-Revert-Use-getImageArch-for-sh4-instead-of-manual-pl.patch \
           "
S = "${WORKDIR}/git"

inherit gitpkgv
SRCREV = "716982ab3c90e73fbf157ad5741b454433babbeb"
PV = "git${SRCPV}"
PKGV = "git${GITPKGV}"

inherit allarch distutils-openplugins gettext

DEPENDS = "gettext-native python"
RDEPENDS_${PN} = " \
        python-compression \
        python-core \
        python-e2icjson \
        python-html \
        python-json \
        python-shell \
        python-subprocess \
        python-textutils \
        python-pycurl \
        ffmpeg \
        wget \
        hlsdl \
        cmdwrap \
        lsdir \
        f4mdump \
        iptvsubparser \
        rtmpdump \
        duktape \
        uchardet \
	"

RDEPENDS_{PN}-src = "${PN}"
FILES_${PN}-src = " \
	${libdir}/enigma2/python/Plugins/*/*.py \
	${libdir}/enigma2/python/Plugins/*/*/*.py \
	${libdir}/enigma2/python/Plugins/*/*/*/*.py \
	${libdir}/enigma2/python/Plugins/*/*/*/*/*.py \
	${libdir}/enigma2/python/Plugins/*/*/*/*/*/*.py \
	${libdir}/enigma2/python/Plugins/*-py2.7.egg-info/* \
	${libdir}/enigma2/python/Plugins/*/locale/*/LC_MESSAGES/*.po \
	"

deltask package_qa

FILES_${PN} += "${sysconfdir}"

do_install_append() {
    install -d ${D}${sysconfdir}
    cp -r  --preserve=mode,links ${S}/vk ${D}${sysconfdir}/vk
}
